import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './CohortDetails';
import styles from './CohortDetails.module.css'; // ✅ CSS Module import

function App() {
  return (
    <div>
      <h1 style={{ paddingLeft: '30px', fontWeight: 'bold' }}>Cohorts Details</h1>

      {/* ✅ IMPORTANT: Add wrapper with className={styles.container} */}
      <div className={styles.container}>
        {CohortsData.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;
