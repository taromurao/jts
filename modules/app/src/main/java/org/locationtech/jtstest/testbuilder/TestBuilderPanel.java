/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.locationtech.jtstest.testbuilder;

import javax.swing.JPanel;

import org.locationtech.jtstest.testbuilder.model.TestBuilderModel;


public abstract class TestBuilderPanel extends JPanel 
{
  protected TestBuilderModel tbModel;
  //protected JTSTestBuilderFrame tbFrame;
  
  TestBuilderPanel() {
    /*
    try {
        jbInit();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    */
  }
  
  protected abstract void uiInit();

  public void setModel(TestBuilderModel tbModel) {
    this.tbModel = tbModel;
  }
}
