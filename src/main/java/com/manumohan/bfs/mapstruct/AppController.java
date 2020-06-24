package com.manumohan.bfs.mapstruct;

import com.manumohan.bfs.mapstruct.mapper.PartyMapper;
import com.manumohan.bfs.mapstruct.model.CodeNameType;
import com.manumohan.bfs.mapstruct.model.Identifier;
import com.manumohan.bfs.mapstruct.model.Party;
import com.manumohan.bfs.mapstruct.model.PartyBase;
import com.manumohan.bfs.mapstruct.model.PartyIdentifierList;
import com.manumohan.bfs.mapstruct.model.PersonDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController
{
	private final PartyMapper partyMapper;

	public AppController(PartyMapper partyMapper)
	{
		this.partyMapper = partyMapper;
	}

	@GetMapping("test")
	public Party getParty()
	{
		Party source = createParty(1234, "423", "PIXEL", "Google", "PHONE", "MR", "MICKEY", "MOUSE", "3", "LICENCE", "4", "MEDICARE");
		Party update = createParty(1231, "421", "GALAXY", "Samsung", "PHONE", "MS", "MINI", "MOUSE", "3", "PASSPORT");

		partyMapper.updateParty(source, update);

		return source;
	}

	public Party createParty(int id, String brandId, String brandCode, String brandName, String type, String title, String firstName, String lastName,
	                         String ...args)
	{
		Party               party            = new Party();
		PartyBase           partyBase        = new PartyBase();
		CodeNameType        brand            = createCodeNameType(brandId, brandCode, brandName, type);
		CodeNameType        partyType        = createCodeNameType("1", "IND", firstName, "INDIVIDUAL");
		PersonDetails       personDetails    = new PersonDetails();
		PartyIdentifierList partyIdList      = new PartyIdentifierList();
		List<Identifier>    partyIdentifiers = new ArrayList<>();

		for (int i = 0; i < args.length; i++)
		{
			Identifier identifier = new Identifier();

			identifier.setId(args[i++]);
			identifier.setType(args[i]);

			partyIdentifiers.add(identifier);
		}

		partyIdList.setPartyIdentifier(partyIdentifiers);

		personDetails.setTitle(title);
		personDetails.setFirstName(firstName);
		personDetails.setLastName(lastName);

		partyBase.setBrand(brand);
		partyBase.setPartyName(firstName + lastName);
		partyBase.setPartyType(partyType);

		party.setPersonDetails(personDetails);
		party.setId(id);
		party.setPartyBase(partyBase);
		party.setPartyIdentifierList(partyIdList);

		return party;
	}

	public CodeNameType createCodeNameType(String id, String code, String name, String type)
	{
		CodeNameType codeNameType = new CodeNameType();

		codeNameType.setId(id);
		codeNameType.setCode(code);
		codeNameType.setName(name);
		codeNameType.setType(type);

		return codeNameType;
	}
}
