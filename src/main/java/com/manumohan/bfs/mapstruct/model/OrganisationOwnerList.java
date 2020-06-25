package com.manumohan.bfs.mapstruct.model;

import java.util.ArrayList;
import java.util.List;

public class OrganisationOwnerList
{
	private List<OrganisationOwner> organisationOwnerList = new ArrayList<>();
	private List<CodeNameType>      ownerList             = new ArrayList<>();
	private List<CodeNameType>      organisationList      = new ArrayList<>();
	private List<PersonDetails>     personDetailsList     = new ArrayList<>();
	private List<String>            states                = new ArrayList<>();

	public List<OrganisationOwner> getOrganisationOwnerList()
	{
		return organisationOwnerList;
	}

	public void setOrganisationOwnerList(List<OrganisationOwner> organisationOwnerList)
	{
		this.organisationOwnerList = organisationOwnerList;
	}

	public List<CodeNameType> getOwnerList()
	{
		return ownerList;
	}

	public void setOwnerList(List<CodeNameType> ownerList)
	{
		this.ownerList = ownerList;
	}

	public List<CodeNameType> getOrganisationList()
	{
		return organisationList;
	}

	public void setOrganisationList(List<CodeNameType> organisationList)
	{
		this.organisationList = organisationList;
	}

	public List<PersonDetails> getPersonDetailsList()
	{
		return personDetailsList;
	}

	public void setPersonDetailsList(List<PersonDetails> personDetailsList)
	{
		this.personDetailsList = personDetailsList;
	}

	public List<String> getStates()
	{
		return states;
	}

	public void setStates(List<String> states)
	{
		this.states = states;
	}
}
