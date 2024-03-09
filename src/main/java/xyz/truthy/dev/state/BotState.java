package xyz.truthy.dev.state;

import java.util.Arrays;

public enum BotState {
    STARTING ,
    DETECTING_WHEAT_FIELDS,
    HARVESTING_WHEAT_FIELDS,
    REPLANTING_WHEAT_FIELDS,
    SELLING_WHEAT,
    UPGRADING_SILO,
    DETECTING_SILO,
    AWAITING_WHEAT_GROW;


    @Override
    public String toString() {
        String name = this.name();
        StringBuilder formattedName = new StringBuilder();

        name = name.replace("_", " ");

        Arrays.stream(name.split(" ")).toList().forEach(word -> {
            char firstChar = word.charAt(0);
            word = word.substring(1, word.length())
                    .toLowerCase();

            formattedName.append(firstChar).append(word).append(" ");
        });

        return formattedName.toString();
    }
}
