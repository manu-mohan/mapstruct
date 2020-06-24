package com.manumohan.bfs.mapstruct.model;

public class Party
{
	private int id;
	private PartyIdentifierList partyIdentifierList;
	private PartyBase partyBase;
	private PersonDetails personDetails;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public PartyIdentifierList getPartyIdentifierList()
	{
		return partyIdentifierList;
	}

	public void setPartyIdentifierList(PartyIdentifierList partyIdentifierList)
	{
		this.partyIdentifierList = partyIdentifierList;
	}

	public PartyBase getPartyBase()
	{
		return partyBase;
	}

	public void setPartyBase(PartyBase partyBase)
	{
		this.partyBase = partyBase;
	}

	public PersonDetails getPersonDetails()
	{
		return personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails)
	{
		this.personDetails = personDetails;
	}
}
