package com.company.sales.web.castomer;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Castomer;

@UiController("sales_Castomer.edit")
@UiDescriptor("castomer-edit.xml")
@EditedEntityContainer("castomerDc")
@LoadDataBeforeShow
public class CastomerEdit extends StandardEditor<Castomer> {
}