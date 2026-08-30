package todo_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final List<Todo> todos = new ArrayList<>();

    public TodoController() {
        todos.add(new Todo(1L, "Study DevOps"));
        todos.add(new Todo(2L, "Finish assignment"));
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todos;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        todo.setId((long) (todos.size() + 1));
        todos.add(todo);
        return todo;
    }

    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable Long id) {
        return todos.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}