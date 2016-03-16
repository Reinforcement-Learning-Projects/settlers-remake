/*******************************************************************************
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.main.android.maplist;

import java.util.Comparator;

import jsettlers.common.menu.IMapDefinition;
import jsettlers.common.utils.collections.ChangingList;
import android.view.LayoutInflater;

public class LoadableMapListAdapter extends MapListAdapter<IMapDefinition> {

	public LoadableMapListAdapter(LayoutInflater inflater, ChangingList<? extends IMapDefinition> baseList) {
		super(inflater, baseList);
	}

	@Override
	public String getTitle(IMapDefinition item) {
		return item.getMapName();
	}

	@Override
	protected short[] getImage(IMapDefinition item) {
		return item.getImage();
	}

	@Override
	protected String getDescriptionString(IMapDefinition item) {
		return item.getCreationDate().toLocaleString();
	}

	@Override
	protected Comparator<? super IMapDefinition> getDefaultComparator() {
		return IMapDefinition.CREATION_DATE_COMPARATOR;
	}
}
