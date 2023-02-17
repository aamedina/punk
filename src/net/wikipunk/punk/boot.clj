(ns net.wikipunk.punk.boot
  {:rdf/type :jsonld/Context}
  (:require
   [net.wikipunk.rdf.as]
   [net.wikipunk.rdf.foaf]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.mop]))

(def punk
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/"
   :rdfa/prefix "punk"})
