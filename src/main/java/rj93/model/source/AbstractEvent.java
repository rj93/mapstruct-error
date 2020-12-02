package rj93.model.source;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@SuperBuilder
public abstract class AbstractEvent {
    private long id;
    private long requestorId;
}
