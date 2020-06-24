package com.manumohan.bfs.mapstruct.mapper;

import com.manumohan.bfs.mapstruct.model.Party;
import com.manumohan.bfs.mapstruct.model.PartyBase;
import com.manumohan.bfs.mapstruct.model.PersonDetails;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
	nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
	collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
	unmappedTargetPolicy = ReportingPolicy.ERROR,
	uses = {PartyIdentifierListMapper.class, OrganisationOwnerListMapper.class},
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PartyMapper
{
	void updateParty(@MappingTarget Party source, Party update);

	void updatePartyBase(@MappingTarget PartyBase source, PartyBase update);

	void updatePersonDetails(@MappingTarget PersonDetails source, PersonDetails update);
}
