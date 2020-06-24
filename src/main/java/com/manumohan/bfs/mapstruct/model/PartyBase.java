package com.manumohan.bfs.mapstruct.model;

public class PartyBase
{
	private String                partyName;
	private CodeNameType          partyType;
	private CodeNameType          partySubType;
	private CodeNameType          partyClassification;
	private CodeNameType          partyStatus;
	private String                versionNo;
	private OrganisationOwnerList organisationOwnerList;
	private CodeNameType          brand;

	public String getPartyName()
	{
		return partyName;
	}

	public void setPartyName(String partyName)
	{
		this.partyName = partyName;
	}

	public CodeNameType getPartyType()
	{
		return partyType;
	}

	public void setPartyType(CodeNameType partyType)
	{
		this.partyType = partyType;
	}

	public CodeNameType getPartySubType()
	{
		return partySubType;
	}

	public void setPartySubType(CodeNameType partySubType)
	{
		this.partySubType = partySubType;
	}

	public CodeNameType getPartyClassification()
	{
		return partyClassification;
	}

	public void setPartyClassification(CodeNameType partyClassification)
	{
		this.partyClassification = partyClassification;
	}

	public CodeNameType getPartyStatus()
	{
		return partyStatus;
	}

	public void setPartyStatus(CodeNameType partyStatus)
	{
		this.partyStatus = partyStatus;
	}

	public String getVersionNo()
	{
		return versionNo;
	}

	public void setVersionNo(String versionNo)
	{
		this.versionNo = versionNo;
	}

	public OrganisationOwnerList getOrganisationOwnerList()
	{
		return organisationOwnerList;
	}

	public void setOrganisationOwnerList(OrganisationOwnerList organisationOwnerList)
	{
		this.organisationOwnerList = organisationOwnerList;
	}

	public CodeNameType getBrand()
	{
		return brand;
	}

	public void setBrand(CodeNameType brand)
	{
		this.brand = brand;
	}
}
