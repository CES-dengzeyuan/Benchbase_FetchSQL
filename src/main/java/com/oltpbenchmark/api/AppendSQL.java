package com.oltpbenchmark.api;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class AppendSQL {
    public static void appendSql(String name, String sql) {
        try {
            FileWriter writer = new FileWriter(name, true);
            writer.write(sql);
            if (!Objects.equals(sql, "EOF\n")) {
                writer.write("EOL");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

