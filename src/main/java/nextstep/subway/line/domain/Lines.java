package nextstep.subway.line.domain;

import java.util.List;
import nextstep.subway.fare.domain.Fare;

public class Lines {

    private final List<Line> lines;

    public Lines(List<Line> lines) {
        this.lines = lines;
    }

    public Fare maxSurcharge() {
        return lines.stream()
            .map(Line::getSurcharge)
            .max(Fare::compareTo)
            .orElse(new Fare(0));
    }
}
