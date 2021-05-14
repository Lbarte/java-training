package sieve;

import java.io.*;

public class InputHandl {
  public int getLimit() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    return Integer.parseInt(reader.readLine());
  }
}
