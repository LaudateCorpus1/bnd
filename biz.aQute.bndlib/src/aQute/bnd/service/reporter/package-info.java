/**
 * This package defines the two services
 * {@link aQute.bnd.service.reporter.ReportGeneratorService} and
 * {@link aQute.bnd.service.reporter.ReportExporterService}
 * <p>
 * The {@link aQute.bnd.service.reporter.ReportGeneratorService} service allows
 * to generate a reports of any objects. A report is a {@link Map} whose keys
 * are an entry in the report and values are the DTO values extracted from a
 * source object. This service can be extended by implementing the
 * {@link aQute.bnd.service.reporter.ReportEntryPlugin} interface for a specific
 * object type.
 * <p>
 * The {@link aQute.bnd.service.reporter.ReportExporterService} service allows
 * to export a report generated by the
 * {@link aQute.bnd.service.reporter.ReportGeneratorService} service into a
 * stream. The report will be serialized into a specific format and can
 * optionally be transformed by a template engine. This service can be extended
 * by implementing the {@link aQute.bnd.service.reporter.ReportSerializerPlugin}
 * and the {@link aQute.bnd.service.reporter.ReportTransformerPlugin} interfaces
 * respectively to support additional serialization format and additional
 * template engine.
 */

@Version("1.0.0")
package aQute.bnd.service.reporter;

import org.osgi.annotation.versioning.Version;
