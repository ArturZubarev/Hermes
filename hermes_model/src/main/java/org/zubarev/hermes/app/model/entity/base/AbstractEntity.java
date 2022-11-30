package org.zubarev.hermes.app.model.entity.base;

import lombok.*;
import org.zubarev.hermes.app.model.entity.person.Account;

import java.time.LocalDateTime;
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public abstract class AbstractEntity {
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Account createdBy;
    private Account modifiedBy;

}
