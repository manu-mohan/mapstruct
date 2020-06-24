package com.manumohan.bfs.mapstruct.util;

import com.manumohan.bfs.mapstruct.model.CodeNameType;
import com.manumohan.bfs.mapstruct.model.Identifier;
import com.manumohan.bfs.mapstruct.model.OrganisationOwner;
import com.manumohan.bfs.mapstruct.model.OrganisationOwnerList;
import com.manumohan.bfs.mapstruct.model.Party;
import com.manumohan.bfs.mapstruct.model.PartyBase;
import com.manumohan.bfs.mapstruct.model.PartyIdentifierList;
import com.manumohan.bfs.mapstruct.model.PersonDetails;

import java.util.ArrayList;
import java.util.List;

public class ModelHelper
{
	public static Party createParty(int id, CodeNameType brand, PersonDetails personDetails, String... args)
	{
		Party                   party                    = new Party();
		PartyBase               partyBase                = new PartyBase();
		CodeNameType            partyType                = createCodeNameType("1", "IND", personDetails.getFirstName(), "INDIVIDUAL");
		PartyIdentifierList     partyIdList              = new PartyIdentifierList();
		List<Identifier>        partyIdentifiers         = new ArrayList<>();
		OrganisationOwnerList   organisationOwnerListRef = new OrganisationOwnerList();
		List<OrganisationOwner> organisationOwnerList    = new ArrayList<>();
		List<PersonDetails>     personDetailsList        = new ArrayList<>();

		for (int i = 0; i < args.length; i++)
		{

			Identifier identifier = new Identifier();

			identifier.setId(args[i++]);
			identifier.setType(args[i]);

			partyIdentifiers.add(identifier);
		}

		try
		{
			PersonDetails copyPersonDetails = personDetails.clone();
			personDetailsList.add(copyPersonDetails);
		} catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}

		organisationOwnerListRef.setOrganisationOwnerList(organisationOwnerList);
		organisationOwnerListRef.setPersonDetailsList(personDetailsList);

		partyIdList.setPartyIdentifier(partyIdentifiers);

		partyBase.setBrand(brand);
		partyBase.setPartyName(personDetails.getFirstName() + personDetails.getLastName());
		partyBase.setPartyType(partyType);
		partyBase.setOrganisationOwnerList(organisationOwnerListRef);

		party.setPersonDetails(personDetails);
		party.setId(id);
		party.setPartyBase(partyBase);
		party.setPartyIdentifierList(partyIdList);

		return party;
	}

	public static CodeNameType createCodeNameType(String id, String code, String name, String type)
	{
		CodeNameType codeNameType = new CodeNameType();

		codeNameType.setId(id);
		codeNameType.setCode(code);
		codeNameType.setName(name);
		codeNameType.setType(type);

		return codeNameType;
	}

	public static PersonDetails createPerson(String title, String firstName, String lastName)
	{
		PersonDetails personDetails = new PersonDetails();

		personDetails.setTitle(title);
		personDetails.setFirstName(firstName);
		personDetails.setLastName(lastName);

		return personDetails;
	}
}
