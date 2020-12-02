package rj93.model.target;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public class EventDto {
    private long eventId;
    private long requestorId;
    private boolean draftSupported;
}
