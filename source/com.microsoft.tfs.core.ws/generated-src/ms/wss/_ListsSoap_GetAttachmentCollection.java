// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_GetAttachmentCollection;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ListsSoap_GetAttachmentCollection
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected String listItemID;

    public _ListsSoap_GetAttachmentCollection()
    {
        super();
    }

    public _ListsSoap_GetAttachmentCollection(
        final String listName,
        final String listItemID)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setListItemID(listItemID);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        this.listName = value;
    }

    public String getListItemID()
    {
        return this.listItemID;
    }

    public void setListItemID(String value)
    {
        this.listItemID = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "listName",
            this.listName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "listItemID",
            this.listItemID);

        writer.writeEndElement();
    }
}