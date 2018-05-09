package com.practice.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubSetsTest
{
  @Test
  public void testSubSetsBitManipulation()
  {
    List<String> subsetsBitManipulation = new SubSets().getSubsetsBitManipulation("abc".toCharArray());
    System.out.println(subsetsBitManipulation);
    assert Arrays.asList("", "a", "b", "ab", "c", "ac", "bc", "abc").equals(subsetsBitManipulation);
  }
}
