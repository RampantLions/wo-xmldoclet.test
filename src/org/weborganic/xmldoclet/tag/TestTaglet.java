/*
 * Copyright (c) 2010 weborganic systems pty. ltd.
 */
package org.weborganic.xmldoclet.tag;

import com.sun.tools.doclets.Taglet;
import com.sun.javadoc.*;
import java.util.Map;

/**
 * A test taglet.
 * 
 * @author Christophe Lauret
 * @version 2 April 2010
 */
public class TestTaglet implements Taglet {

  /**
   * The name of this taglet.
   */
  private final String _name;

  /**
   * 
   * @param name
   * @param header
   */
  public TestTaglet() {
    this._name = "MyTestTaglet";
  }

  /**
   * Return the name of this custom tag.
   */
  public String getName() {
    return this._name;
  }

  /**
   * @return <code>false</code>.
   */
  public boolean inField() {
    return false;
  }

  /**
   * @return <code>false</code>.
   */
  public boolean inConstructor() {
    return false;
  }

  /**
   * @return <code>true</code>.
   */
  public boolean inMethod() {
    return true;
  }

  /**
   * @return <code>true</code>.
   */
  public boolean inOverview() {
    return true;
  }

  /**
   * @return <code>true</code>
   */
  public boolean inPackage() {
    return true;
  }

  /**
   * @return <code>true</code>.
   */
  public boolean inType() {
    return true;
  }

  /**
   * @return <code>false</code>
   */
  public boolean isInlineTag() {
    return false;
  }

  /**
   * Register this Taglet.
   * 
   * @param map the map to register this tag to.
   */
  public static void register(Map<String, Taglet> map) {
    TestTaglet tag = new TestTaglet();
    Taglet t = map.get(tag.getName());
    if (t != null) {
      map.remove(tag.getName());
    }
    map.put(tag.getName(), tag);
  }

  /**
   * Given the <code>Tag</code> representation of this custom tag, return its string representation.
   * 
   * @param tag the <code>Tag</code> representation of this custom tag.
   */
  public String toString(Tag tag) {
    return "<test-tags>" + toSingle(tag) + "</test-tags>\n";
  }

  /**
   * Given an array of <code>Tag</code>s representing this custom tag, return its string representation.
   * 
   * @param tags the array of <code>Tag</code>s representing of this custom tag.
   */
  public String toString(Tag[] tags) {
    if (tags.length == 0) { return null; }
    String out = "<test-tags>";
    for (Tag tag : tags) {
      out += toSingle(tag);
    }
    out += "</test-tags>\n";
    return out;
  }

  /**
   * Given an array of <code>Tag</code>s representing this custom tag, return its string representation.
   * 
   * @param tag the <code>Tag</code> representing of this custom tag.
   */
  private String toSingle(Tag tag) {
     return "<tag-test>"+tag.text()+"</tag-test>";        
  }

}
