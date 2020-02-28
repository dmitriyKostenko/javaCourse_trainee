package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StartUI {
    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker, output);
        }
    }

    private void showMenu(List<UserAction> actions) {
        output.accept("Menu.");
        for (UserAction action : actions) {
            output.accept(actions.indexOf(action) + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(),
                new ShowAllItemsAction(),
                new EditItemAction(),
                new DeleteItemAction(),
                new SearchByIdAction(),
                new SearchByNameAction(),
                new ExitAction()
        );
        new StartUI(validate, tracker, System.out::println).init(actions);
    }
}