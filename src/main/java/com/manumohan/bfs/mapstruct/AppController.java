package com.manumohan.bfs.mapstruct;

import com.manumohan.bfs.mapstruct.mapper.PartyMapper;
import com.manumohan.bfs.mapstruct.model.CodeNameType;
import com.manumohan.bfs.mapstruct.model.Party;
import com.manumohan.bfs.mapstruct.model.PersonDetails;
import com.manumohan.bfs.mapstruct.util.ModelHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		CodeNameType sourceBrand = ModelHelper.createCodeNameType("423", "PIXEL", "Google", "PHONE");
		CodeNameType updateBrand = ModelHelper.createCodeNameType("424", "GALAXY", "Samsung", "PHONE");

		PersonDetails sourcePersonDetails = ModelHelper.createPerson("MR", "MICKEY", "MOUSE");
		PersonDetails updatePersonDetails = ModelHelper.createPerson("MS", "MICKEY", "MINI");

		Party source = ModelHelper.createParty(1234, sourceBrand, sourcePersonDetails, "3", "LICENCE", "4", "MEDICARE");
		Party update = ModelHelper.createParty(1231, updateBrand, updatePersonDetails, "3", "PASSPORT");

		partyMapper.updateParty(source, update);

		return source;
	}
}
