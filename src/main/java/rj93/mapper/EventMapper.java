package rj93.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rj93.model.source.AbstractEvent;
import rj93.model.target.EventDto;

@Mapper
public interface EventMapper {

    @Mappings({
            @Mapping(target = "eventId", source = "id"),
            @Mapping(target = "requestorId", source = "requestorId"),
    })
    EventDto map(AbstractEvent event);

}
