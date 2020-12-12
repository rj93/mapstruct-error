package rj93.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import rj93.model.source.MyEvent;
import rj93.model.source.MySecondEvent;
import rj93.model.target.MyEventDto;
import rj93.model.target.MySecondEventDto;

@Mapper(config = EventMapperConfig.class)
public interface MySecondEventMapper {

    @InheritConfiguration
    MySecondEventDto map(MySecondEvent event);

    @InheritConfiguration
    MySecondEventDto map(MySecondEvent event, int computedValue);
}
