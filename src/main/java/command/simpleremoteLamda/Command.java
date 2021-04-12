package command.simpleremoteLamda;

import lombok.Data;

@FunctionalInterface
public interface Command {
    void execute();
}
