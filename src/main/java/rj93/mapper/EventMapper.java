package rj93.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import rj93.model.source.AbstractEvent;

@Mapper
public interface EventMapper {

    @Named("supportsDraft")
    default boolean supportsDraft(AbstractEvent event) {
        return event.supportsDraft();
    }

}
