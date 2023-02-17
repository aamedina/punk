(ns net.wikipunk.rdf.punk
  "RDF vocabulary for wikipunk.net"
  {:rdf/type :owl/Ontology})

(def Shard
  "A shard contains a set of worlds."
  {:db/ident   :punk/Shard
   :rdf/type   :owl/Class
   :rdfs/label [{:rdf/language "he" :rdf/value "קלפה"}
                {:rdf/language "ar" :rdf/value "شظية"}
                {:rdf/language "en" :rdf/value "Shard"}]})

(def World
  "A world contains a set of facts."
  {:db/ident   :punk/World
   :rdf/type   :owl/Class
   :rdfs/label [{:rdf/language "he" :rdf/value "עולם"}
                {:rdf/language "ar" :rdf/value "عالم"}
                {:rdf/language "en" :rdf/value "World"}]})

(def Aleph
  "The first shard."
  {:db/ident   :punk/Aleph
   :rdf/type   [:punk/Shard :owl/NamedIndividual]
   :rdfs/label [{:rdf/language "he" :rdf/value "אלף"}
                {:rdf/language "ar" :rdf/value "أَلِف"}
                {:rdf/language "en" :rdf/value "Aleph"}]})

(def Orrery
  "The orrery calculates the moon-phase using parameters that can be
  influenced by the users. Moon-gates are controlled by the active 
  moon phase."
  {:db/ident   :punk/Orrery
   :rdf/type   [:owl/Class :owl/NamedIndividual]
   :rdfs/label [{:rdf/language "he" :rdf/value "מזלות"}
                {:rdf/language "ar" :rdf/value "ثروات"}
                {:rdf/language "en" :rdf/value "Orrery"}]})

(def EmotionMachine
  "The Emotion Machine reacts to what the users are doing using
  narratives that can be influenced by the orrery."
  {:db/ident   :punk/EmotionMachine
   :rdf/type   [:owl/Class :owl/NamedIndividual]
   :rdfs/label [{:rdf/language "he" :rdf/value "ספירות"}
                {:rdf/language "ar" :rdf/value "سيفروت"}
                {:rdf/language "en" :rdf/value "Emotion Machine"}]})

(def CharacterClass
  "A character is an agent that can participate in and create
  narratives."
  {:db/ident        :punk/Character
   :rdf/type        :owl/Class
   :rdfs/subClassOf :foaf/Person})

(def Moongate
  "A moongate is a portal between points in space whose destination
  depends on the moon phase. Some moongates can be programmed by their
  owner and others run code too ancient to be interpreted by Abulafia."
  {:db/ident :punk/Moongate
   :rdf/type :owl/Class})

(def Abulafia
  "Abulafia is the name of the artificial intelligence which controls
  the moongates of Nargoth."
  {:db/ident :punk/Abulafia
   :rdf/type [:owl/Class :owl/NamedIndividual]})

(def Nargoth
  "Nargoth is the name of the world."
  {:db/ident :punk/Nargoth
   :rdf/type [:punk/World :owl/NamedIndividual]})
