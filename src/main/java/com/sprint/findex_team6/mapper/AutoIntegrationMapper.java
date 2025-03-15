package com.sprint.findex_team6.mapper;

import com.sprint.findex_team6.dto.AutoIntegrationDto;
import com.sprint.findex_team6.entity.AutoIntegration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AutoIntegrationMapper {

    @Mapping(source = "index.id", target = "indexId")
    AutoIntegrationDto toDto(AutoIntegration entity);
}
