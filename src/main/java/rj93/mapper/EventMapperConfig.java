package rj93.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rj93.model.source.AbstractEvent;
import rj93.model.target.EventDto;

@MapperConfig(uses = EventMapper.class)
public interface EventMapperConfig {

    @Mappings({
            @Mapping(target = "eventId", source = "id"),
            @Mapping(target = "requestorId", source = "requestorId"),
            @Mapping(target = "draftSupported", source = "event", qualifiedByName = "supportsDraft"),
    })
    EventDto map(AbstractEvent event);
}
