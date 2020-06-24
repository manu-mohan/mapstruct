package com.manumohan.bfs.mapstruct;

import com.manumohan.bfs.mapstruct.mapper.PartyMapper;
import com.manumohan.bfs.mapstruct.model.CodeNameType;
import com.manumohan.bfs.mapstruct.model.Party;
import com.manumohan.bfs.mapstruct.model.PersonDetails;
import com.manumohan.bfs.mapstruct.util.ModelHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MapstructApplicationTests
{
	@Autowired
	private PartyMapper partyMapper;

	static Party source;
	static Party update;

	@BeforeAll
	private static void setup()
	{
		CodeNameType sourceBrand = ModelHelper.createCodeNameType("423", "PIXEL", "Google", "PHONE");
		CodeNameType updateBrand = ModelHelper.createCodeNameType("424", "GALAXY", "Samsung", "PHONE");

		PersonDetails sourcePersonDetails = ModelHelper.createPerson("MR", "MICKEY", "MOUSE");
		PersonDetails updatePersonDetails = ModelHelper.createPerson("MS", "MICKY", "MOUSE");

		source = ModelHelper.createParty(1234, sourceBrand, sourcePersonDetails, "3", "LICENCE", "4", "MEDICARE");
		update = ModelHelper.createParty(1231, updateBrand, updatePersonDetails, "3", "PASSPORT", "5", "PENSION");
	}

	@Test
	void givenUpdatesToSource_whenUpdateHasAdditionalNestedFieldsThanSource_thenCorrect()
	{
		partyMapper.updateParty(source, update);

		assertEquals(update.getId(), source.getId());
		assertEquals("MS", source.getPersonDetails().getTitle());
		assertEquals("MICKY", source.getPersonDetails().getFirstName());
		assertEquals("MOUSE", source.getPersonDetails().getLastName());
		assertEquals("3", source.getPartyIdentifierList().getPartyIdentifier().get(0).id);
		assertEquals("PASSPORT", source.getPartyIdentifierList().getPartyIdentifier().get(0).type);
		assertEquals("4", source.getPartyIdentifierList().getPartyIdentifier().get(1).id);
		assertEquals("MEDICARE", source.getPartyIdentifierList().getPartyIdentifier().get(1).type);
		assertEquals("5", source.getPartyIdentifierList().getPartyIdentifier().get(2).id);
		assertEquals("PENSION", source.getPartyIdentifierList().getPartyIdentifier().get(2).type);
	}
}
