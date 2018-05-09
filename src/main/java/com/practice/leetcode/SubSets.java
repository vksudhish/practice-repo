package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSets
{
  // Print all subsets of given set[]
  List<String> getSubsetsBitManipulation(char set[])
  {
    int n = set.length;
    final List<String> result = new ArrayList<>();
    final StringBuilder builder = new StringBuilder();
    // Run a loop for printing all 2^n
    // subsets one by obe
    for (int i = 0; i < (1 << n); i++) {
      // Print current subset
      builder.setLength(0);
      for (int j = 0; j < n; j++)
      // (1<<j) is a number with jth bit 1
      // so when we 'and' them with the
      // subset number we get which numbers
      // are present in the subset and which
      // are not
      {
        if ((i & (1 << j)) > 0) {
          builder.append(set[j]);
        }
      }
      result.add(builder.toString());
    }
    return result;
  }

}
