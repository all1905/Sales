package com.company.sales.web.castomer;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Castomer;

@UiController("sales_Castomer.browse")
@UiDescriptor("castomer-browse.xml")
@LookupComponent("castomersTable")
@LoadDataBeforeShow
public class CastomerBrowse extends StandardLookup<Castomer> {
}