
public class Rule {
    private String name;
    private String expression;
    private String outcome;
    private Integer priority;
    private String description;
    private String namespace;

    public Rule(String name, String expression, String outcome, Integer priority, String namespace, String description) {
        this.name = name;
        this.expression = expression;
        this.outcome = outcome;
        this.priority = priority;
        this.description = description;
        this.namespace = namespace;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
