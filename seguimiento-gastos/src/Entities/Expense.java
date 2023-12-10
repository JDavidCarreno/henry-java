package Entities;

public class Expense {
    private static Integer id_counter = 0;
    private final Integer id;
    private Double amount;
    private Integer expenseCategoryId;
    private String date;

    public Expense() {
        this.id = id_counter;
        id_counter++;
    }

    public Expense(Double amount, Integer expenseCategoryId, String date) {
        this.id = id_counter;
        this.amount = amount;
        this.expenseCategoryId = expenseCategoryId;
        this.date = date;
        id_counter++;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCategoryId() {
        return expenseCategoryId;
    }

    public void setCategory(Integer expenseCategoryId) {
        this.expenseCategoryId = expenseCategoryId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", category=" + expenseCategoryId +
                ", date='" + date + '\'' +
                '}';
    }
}
