package ec.cjpq.parrot.admin.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;

import org.zkoss.zul.Textbox;

public class LoginController extends SelectorComposer<Component>{

    @Wire
    private Textbox userTextbox;
    @Wire
    private Textbox passwordTextbox;

}
