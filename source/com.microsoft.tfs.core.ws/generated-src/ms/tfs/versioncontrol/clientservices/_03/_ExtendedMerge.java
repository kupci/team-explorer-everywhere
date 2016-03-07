// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._Change;
import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._ChangesetSummary;
import ms.tfs.versioncontrol.clientservices._03._ExtendedMerge;
import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemIdentifier;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ExtendedMerge
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ChangesetSummary sourceChangeset;
    protected _ChangesetSummary targetChangeset;
    protected int versionedItemCount;
    protected _Change sourceItem;
    protected _ItemIdentifier targetItem;

    public _ExtendedMerge()
    {
        super();
    }

    public _ExtendedMerge(
        final _ChangesetSummary sourceChangeset,
        final _ChangesetSummary targetChangeset,
        final int versionedItemCount,
        final _Change sourceItem,
        final _ItemIdentifier targetItem)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSourceChangeset(sourceChangeset);
        setTargetChangeset(targetChangeset);
        setVersionedItemCount(versionedItemCount);
        setSourceItem(sourceItem);
        setTargetItem(targetItem);
    }

    public _ChangesetSummary getSourceChangeset()
    {
        return this.sourceChangeset;
    }

    public void setSourceChangeset(_ChangesetSummary value)
    {
        this.sourceChangeset = value;
    }

    public _ChangesetSummary getTargetChangeset()
    {
        return this.targetChangeset;
    }

    public void setTargetChangeset(_ChangesetSummary value)
    {
        this.targetChangeset = value;
    }

    public int getVersionedItemCount()
    {
        return this.versionedItemCount;
    }

    public void setVersionedItemCount(int value)
    {
        this.versionedItemCount = value;
    }

    public _Change getSourceItem()
    {
        return this.sourceItem;
    }

    public void setSourceItem(_Change value)
    {
        this.sourceItem = value;
    }

    public _ItemIdentifier getTargetItem()
    {
        return this.targetItem;
    }

    public void setTargetItem(_ItemIdentifier value)
    {
        this.targetItem = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.sourceChangeset != null)
        {
            this.sourceChangeset.writeAsElement(
                writer,
                "SourceChangeset");
        }

        if (this.targetChangeset != null)
        {
            this.targetChangeset.writeAsElement(
                writer,
                "TargetChangeset");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "VersionedItemCount",
            this.versionedItemCount);

        if (this.sourceItem != null)
        {
            this.sourceItem.writeAsElement(
                writer,
                "SourceItem");
        }

        if (this.targetItem != null)
        {
            this.targetItem.writeAsElement(
                writer,
                "TargetItem");
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("SourceChangeset"))
                {
                    this.sourceChangeset = new _ChangesetSummary();
                    this.sourceChangeset.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("TargetChangeset"))
                {
                    this.targetChangeset = new _ChangesetSummary();
                    this.targetChangeset.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("VersionedItemCount"))
                {
                    this.versionedItemCount = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("SourceItem"))
                {
                    this.sourceItem = new _Change();
                    this.sourceItem.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("TargetItem"))
                {
                    this.targetItem = new _ItemIdentifier();
                    this.targetItem.readFromElement(reader);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}