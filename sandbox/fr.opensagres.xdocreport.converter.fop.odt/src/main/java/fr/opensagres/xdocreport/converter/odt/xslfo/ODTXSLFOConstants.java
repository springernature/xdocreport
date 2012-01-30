/**
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com>, Pascal Leclercq <pascal.leclercq@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.opensagres.xdocreport.converter.odt.xslfo;

public interface ODTXSLFOConstants
{

    String XSL_FO_TEMPLATE_URI = "odt2fo.xsl";

    String CONTENT_XML_ENTRY = "content.xml";

    String STYLES_XML_ENTRY = "styles.xml";

    String META_XML_ENTRY = "meta.xml";

    String[] XML_ENTRIES = { CONTENT_XML_ENTRY, STYLES_XML_ENTRY, META_XML_ENTRY };
}
