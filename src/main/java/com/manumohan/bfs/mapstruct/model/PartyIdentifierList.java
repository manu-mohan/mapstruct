package com.manumohan.bfs.mapstruct.model;

import java.util.ArrayList;
import java.util.List;

public class PartyIdentifierList
{
	private List<Identifier> partyIdentifier = new ArrayList<>();

	public List<Identifier> getPartyIdentifier()
	{
		return partyIdentifier;
	}

	public void setPartyIdentifier(List<Identifier> partyIdentifier)
	{
		this.partyIdentifier = partyIdentifier;
	}
}
