package rj93.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import rj93.model.source.MyEvent;
import rj93.model.target.MyEventDto;

@Mapper(config = EventMapperConfig.class)
public interface MyEventMapper {

    @InheritConfiguration
    MyEventDto map(MyEvent event);
}
