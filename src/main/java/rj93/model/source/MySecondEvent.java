package rj93.model.source;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class MySecondEvent extends MyEvent {
    @Override
    public boolean supportsDraft() {
        return true;
    }
}
