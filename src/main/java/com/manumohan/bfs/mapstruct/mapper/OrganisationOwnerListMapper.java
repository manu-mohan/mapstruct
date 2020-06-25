package com.manumohan.bfs.mapstruct.mapper;

import com.manumohan.bfs.mapstruct.model.OrganisationOwnerList;
import com.manumohan.bfs.mapstruct.util.ListUtil;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
	nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
	collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
	unmappedTargetPolicy = ReportingPolicy.ERROR,
	uses = {ListUtil.class, CustomListMapper.class},
	componentModel = "spring",
	injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrganisationOwnerListMapper
{
	@Mapping(target = "ownerList", qualifiedByName = {"CustomListMapper", "ownerListMapper"})
	@Mapping(target = "personDetailsList", qualifiedByName = "personDetailsListMapper")
	@Mapping(target = "organisationOwnerList", qualifiedByName = "genericListMapper")
	@Mapping(target = "organisationList", qualifiedByName = "genericListMapper")
	void updateOrganisationOwnerList(@MappingTarget OrganisationOwnerList source, OrganisationOwnerList update);
}
