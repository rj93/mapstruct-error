package rj93.mapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import rj93.model.source.MyEvent;
import rj93.model.target.MyEventDto;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MyEventMapperTest {

    private MyEventMapper myEventMapper = Mappers.getMapper(MyEventMapper.class);

    @Test
    public void testEventId() {
        MyEvent myEvent = createEvent();

        MyEventDto result = myEventMapper.map(myEvent);

        assertSame(result.getEventId(), myEvent.getId());
    }

    @Test
    public void testSupportsDraft() {
        MyEvent myEvent = createEvent();

        MyEventDto result = myEventMapper.map(myEvent);

        assertSame(result.isDraftSupported(), myEvent.supportsDraft());
    }

    @Test
    public void testRequestorId() {
        MyEvent myEvent = createEvent();

        MyEventDto result = myEventMapper.map(myEvent);

        assertSame(result.getRequestorId(), myEvent.getRequestorId());
    }

    @Test
    public void testEventName() {
        MyEvent myEvent = createEvent();

        MyEventDto result = myEventMapper.map(myEvent);

        assertSame(result.getEventName(), myEvent.getEventName());
    }

    private static MyEvent createEvent() {
        return MyEvent.builder()
                .id(1L)
                .requestorId(1L)
                .eventName("test event")
                .build();
    }
}
