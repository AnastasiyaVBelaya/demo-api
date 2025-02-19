package activities;

import java.util.Objects;

public class ActivityBody {

    private int id;
    private String title;
    private String dueDate;
    private boolean completed;

    public ActivityBody(int id, String title, String dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityBody that = (ActivityBody) o;
        return id == that.id && completed == that.completed && Objects.equals(title, that.title) && Objects.equals(dueDate, that.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, dueDate, completed);
    }

    @Override
    public String toString() {
        return "ActivityBody{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", completed=" + completed +
                '}';
    }
}
