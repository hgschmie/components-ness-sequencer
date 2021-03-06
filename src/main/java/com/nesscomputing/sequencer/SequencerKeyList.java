/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.sequencer;

import java.io.Serializable;
import java.util.AbstractList;

class SequencerKeyList<K> extends AbstractList<K> implements Serializable
{
    private static final long serialVersionUID = 1L;

    private final Sequencer<K> sequencer;

    public SequencerKeyList(Sequencer<K> sequencer)
    {
        this.sequencer = sequencer;
    }

    @Override
    public K get(int index)
    {
        return sequencer.unsequence(index);
    }

    @Override
    public int size()
    {
        return sequencer.size();
    }
}
