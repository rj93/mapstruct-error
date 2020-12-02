package rj93.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import rj93.model.source.AbstractEvent;
import rj93.model.target.EventDto;

@Mapper
public interface EventMapper {

    @Mappings({
            @Mapping(target = "eventId", source = "id"),
            @Mapping(target = "requestorId", source = "requestorId"),
            @Mapping(target = "draftSupported", source = "event", qualifiedByName = "supportsDraft"),
    })
    EventDto map(AbstractEvent event);

    @Named("supportsDraft")
    default boolean supportsDraft(AbstractEvent event) {
        return event.supportsDraft();
    }

}
