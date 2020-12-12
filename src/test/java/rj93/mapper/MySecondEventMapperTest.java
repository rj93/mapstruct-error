package rj93.mapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import rj93.model.source.MyEvent;
import rj93.model.source.MySecondEvent;
import rj93.model.target.MyEventDto;
import rj93.model.target.MySecondEventDto;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MySecondEventMapperTest {

    private MySecondEventMapper mySecondEventMapper = Mappers.getMapper(MySecondEventMapper.class);

    @Test
    public void testEventId() {
        MySecondEvent mySecondEvent = createEvent();

        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent);

        assertSame(result.getEventId(), mySecondEvent.getId());
    }

    @Test
    public void testSupportsDraft() {
        MySecondEvent mySecondEvent = createEvent();

        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent);

        assertSame(result.isDraftSupported(), mySecondEvent.supportsDraft());
    }

    @Test
    public void testRequestorId() {
        MySecondEvent mySecondEvent = createEvent();

        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent);

        assertSame(result.getRequestorId(), mySecondEvent.getRequestorId());
    }

    @Test
    public void testEventName() {
        MySecondEvent mySecondEvent = createEvent();

        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent);

        assertSame(result.getEventName(), mySecondEvent.getEventName());
    }

    @Test
    public void testEventId_Overloaded() {
        MySecondEvent mySecondEvent = createEvent();

        int computedValue = 1;
        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent, computedValue);

        assertSame(result.getEventId(), mySecondEvent.getId());
    }

    @Test
    public void testSupportsDraft_Overloaded() {
        MySecondEvent mySecondEvent = createEvent();

        int computedValue = 1;
        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent, computedValue);

        assertSame(result.isDraftSupported(), mySecondEvent.supportsDraft());
    }

    @Test
    public void testRequestorId_Overloaded() {
        MySecondEvent mySecondEvent = createEvent();

        int computedValue = 1;
        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent, computedValue);

        assertSame(result.getRequestorId(), mySecondEvent.getRequestorId());
    }

    @Test
    public void testEventName_Overloaded() {
        MySecondEvent mySecondEvent = createEvent();

        int computedValue = 1;
        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent, computedValue);

        assertSame(result.getEventName(), mySecondEvent.getEventName());
    }

    @Test
    public void testComputedValue_Overloaded() {
        MySecondEvent mySecondEvent = createEvent();

        int computedValue = 1;
        MySecondEventDto result = mySecondEventMapper.map(mySecondEvent, computedValue);

        assertSame(result.getComputedValue(), computedValue);
    }

    private static MySecondEvent createEvent() {
        return MySecondEvent.builder()
                .id(1L)
                .requestorId(1L)
                .eventName("test event")
                .build();
    }
}
