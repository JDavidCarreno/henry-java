package dao.dto;

public class ExpenseCategoryDto {
    private String name;
    private Integer amount;

    public ExpenseCategoryDto() {
    }

    public ExpenseCategoryDto(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ExpenseCategoryDto{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
