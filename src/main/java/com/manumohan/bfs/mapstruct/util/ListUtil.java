package com.manumohan.bfs.mapstruct.util;

import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class ListUtil
{
	@Named("genericListMapper")
	public <T> void mapList(@MappingTarget List<T> sourceList, List<T> updateList)
	{
		if (updateList != null && !updateList.isEmpty())
		{
			for (T update : updateList)
			{
				if (sourceList.contains(update))
				{
					sourceList.set(sourceList.indexOf(update), update);
				}
				else
				{
					sourceList.add(update);
				}
			}
		}
	}
}
