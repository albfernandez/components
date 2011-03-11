package org.richfaces.taglib;

import org.richfaces.view.facelets.RowKeyConverterRule;

import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.MetaRuleset;

/**
 * User: Gleb Galkin
 * Date: 11.03.11
 */
public class ListHandler extends ComponentHandler {

    public ListHandler(ComponentConfig config) {
        super(config);
    }

    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset metaRuleset = super.createMetaRuleset(type);
        metaRuleset.addRule(RowKeyConverterRule.INSTANCE);
        return metaRuleset;
    }
}