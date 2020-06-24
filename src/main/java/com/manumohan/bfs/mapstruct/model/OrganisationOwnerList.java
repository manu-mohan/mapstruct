package com.manumohan.bfs.mapstruct.model;

import java.util.ArrayList;
import java.util.List;

public class OrganisationOwnerList
{
	private List<OrganisationOwner> organisationOwnerList = new ArrayList<>();

	public List<OrganisationOwner> getOrganisationOwnerList()
	{
		return organisationOwnerList;
	}

	public void setOrganisationOwnerList(List<OrganisationOwner> organisationOwnerList)
	{
		this.organisationOwnerList = organisationOwnerList;
	}
}
