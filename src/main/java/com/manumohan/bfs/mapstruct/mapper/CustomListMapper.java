package com.manumohan.bfs.mapstruct.mapper;

import com.manumohan.bfs.mapstruct.model.CodeNameType;
import com.manumohan.bfs.mapstruct.model.PersonDetails;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.List;

@Named("CustomListMapper")
public class CustomListMapper
{
	@Named("ownerListMapper")
	void updateOwnerList(@MappingTarget List<CodeNameType> sourceList, List<CodeNameType> updateList)
	{
		// Custom logic to override mapping list
	}

	@Named("personDetailsListMapper")
	void updatePersonDetailsList(@MappingTarget List<PersonDetails> sourceList, List<PersonDetails> updateList)
	{
		// Custom logic to override mapping list
		for(PersonDetails update : updateList)
		{
			if(sourceList.contains(update))
			{
				sourceList.add(sourceList.indexOf(update), update);
			}
		}
	}
}
