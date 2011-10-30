package gherkin.formatter.model;

import java.util.List;

public class ExamplesTableRow extends Row {
    private final String id;

    public ExamplesTableRow(List<Comment> comments, List<String> cells, int line, String id) {
        super(comments, cells, line);
        this.id = id;
    }

    @Override
    public DiffType getDiffType() {
        return DiffType.NONE;
    }
}
