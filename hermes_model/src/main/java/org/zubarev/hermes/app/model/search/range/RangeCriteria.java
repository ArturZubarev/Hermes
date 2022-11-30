package org.zubarev.hermes.app.model.search.range;

import com.google.common.base.Preconditions;
import lombok.Data;
import org.zubarev.hermes.app.infra.exception.flow.InvalidParameterException;
import org.zubarev.hermes.app.infra.util.Checks;

@Data
public class RangeCriteria {
    private final int page;
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        Checks.checkParameter(page >= 0, "Incorrect page index:" + page);
        Checks.checkParameter(rowCount >= 0, "Incorrect row parameter: " + rowCount);
        this.page = page;
        this.rowCount = rowCount;
    }


}
